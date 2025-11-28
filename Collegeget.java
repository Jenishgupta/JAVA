class Studentget {
    int sno;
    String sname;

    void setSno(int sno) {
        this.sno = sno;
    }

    int getSno() {
        return this.sno;
    }

    void setSName(String sname) {
        this.sname = sname;
    }

    String getSName() {
        return this.sname;
    }

    void display() {
        System.out.println(sno + "..." + sname);
    }
}

class Collegeget {
    public static void main(String[] args) {
        Studentget s1 = new Studentget();

        s1.setSno(101);
        s1.setSName("HK");

        System.out.println(s1.getSno());
        System.out.println(s1.getSName());
    }
}