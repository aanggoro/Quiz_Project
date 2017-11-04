package com.example.root.ujiantengahsemester;

public class QuizActivity2 {

    public String mquiz2[] = {
            "4 x 2 =",
            "Merah + Biru =",
            "Senjatanya Thor adalah",
            "White Board berwarna ?",
            "Sapi minumnya ?"

    };
    private String mjawaban[][] ={
            {"8","88","8888","88888","888888"},
            {"MerahBiru","Ungu","Hitam","Kuning"},
            {"Arit","Palu","Paku","Linggis","Meteran"},
            {"Pelangi","Hitam","Putih","Lusuh","Luntur"},
            {"Air","Susu","Jamu","Beer","Kuah Bakso"}
    };
    private String mjawabanbenar[] = {"8","Ungu","Palu","Putih","Air"};

    public String getQuiz2(int a){
        String quiz2 = mquiz2[a];
        return quiz2;
    }

    public String getJawaban1 (int a){
        String jawaban = mjawaban[a][0];
        return jawaban;
    }
    public String getJawaban2 (int a){
        String jawaban = mjawaban[a][1];
        return jawaban;
    }
    public String getJawaban3 (int a){
        String jawaban = mjawaban[a][2];
        return jawaban;
    }
    public String getJawaban4 (int a){
        String jawaban = mjawaban[a][3];
        return jawaban;
    }
    public String getJawaban5 (int a){
        String jawaban = mjawaban[a][4];
        return jawaban;
    }
    public String getJawabantrue(int a){
        String jawaban = mjawabanbenar[a];
        return jawaban;
    }


}
