package com.example.anggi.anggi_priatna_1202150042_modul5;

/**
 * Created by Anggi on 3/25/2018.
 */

public class ListItem {

    private String todo, desc, prior;



//  Konstruktor dari variabel yang sudah di deklarasi

    public ListItem(String todo, String desc, String prior) {

        this.todo = todo;

        this.desc = desc;

        this.prior = prior;

    }

// Method setter getter untuk mengatur dan mendapatkan nilai dari variabel yang sudah di deklarasikan

    public String getTodo() {

        return todo;

    }



    public void setTodo(String todo) {

        this.todo = todo;

    }



    public String getDesc() {

        return desc;

    }



    public void setDesc(String desc) {

        this.desc = desc;

    }



    public String getPrior() {

        return prior;

    }



    public void setPrior(String prior) {

        this.prior = prior;

    }

}