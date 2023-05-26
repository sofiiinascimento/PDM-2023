package br.com.ifsc.blocodenotas.controller;

import android.content.Context;

import br.com.ifsc.blocodenotas.modelo.Nota;
import br.com.ifsc.blocodenotas.modelo.NotaDao;

public class NotaController {
        Context mContext;
        NotaDao notaDao;
        public NotaController(Context c){
            mContext=c;
            notaDao= new NotaDao(c);

        }

        public Nota cadastrarNovaNota(Nota n){
            return notaDao.inserirNota(n);

        }
}

