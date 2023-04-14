package br.com.ifsc.aula14_04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ListAdapter;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    PackageManager pm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listaView);

        //Recuperando dados (Apps dos systema)
        pm = getPackageManager();
        ArrayList<String> appNames = new ArrayList<>();
        List<ApplicationInfo> apps = pm.getInstalledApplications(PackageManager.GET_META_DATA);
        for (ApplicationInfo app : apps){
            appNames.add(app.loadLabel(pm).toString());
        }

        //Criando o adapter padrão do array adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, appNames);

        //Adaptador personalizado (Custom Adapter)
        AplicativosAdapter adapter2 = new AplicativosAdapter(
                this, R.layout.intem_lista,apps
        );

        //Setando o adapter
        listView.setAdapter(adapter2);
    }
}