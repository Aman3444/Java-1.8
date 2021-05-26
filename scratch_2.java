class scratch {
    public static void main(String[] args) {
        String s1 = "The quick brown fox jump set rest";
        String s2 = "The brown jump rest";

        String [] sa = s1.split(" ",0);
        String [] sb = s2.split(" ",0);

        for(int i = 0; i<sa.length;i++){
            if (!sa[i].equals(sb[0]) && !sa[i].equals(sb[1]) && !sa[i].equals(sb[2]) && !sa[i].equals(sb[3])){
                System.out.print(sa[i] + " ");
            }

        }
    }
}