class objet {
    String name;
    int mark;

    void display(){
        System.out.println(name+" "+mark);

    }

    public static void main(String[] args) {
    
        objet s1 =new objet();
        objet s2 =new objet();

        s1.name="sam";
        s1.mark=90;

        s2.name="kumarr";
        s2.mark=45;

        s1.display();
        s2.display();



    }
    
}
