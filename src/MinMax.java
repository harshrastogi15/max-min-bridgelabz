class MinMax{

    public static Integer findMax(Integer a, Integer b, Integer c){
        if((a.compareTo(b)>0) && (a.compareTo(c)>0)){
            return a;
        }else if((b.compareTo(a)>0) && (b.compareTo(c)>0)){
            return b;
        }else{
            return c;
        }
    }

    public static Double findMax(Double a, Double b, Double c){
        if((a.compareTo(b)>0) && (a.compareTo(c)>0)){
            return a;
        }else if((b.compareTo(a)>0) && (b.compareTo(c)>0)){
            return b;
        }else{
            return c;
        }
    }
    public static void main(String[] args){
        System.out.println("Min Max Problem");
        Integer a = 4, b= 1, c =1;
        Integer mx = findMax(a,b,c);
        System.out.println(mx);
        Double ad = 1.3, bd = 12.5, cd = 1.5;
        Double mxd = findMax(ad,bd,cd);
        System.out.println(mxd);
    }
}