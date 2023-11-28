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

    public static void main(String[] args){
        System.out.println("Min Max Problem");
        Integer a = 4, b= 1, c =1;
        Integer mx = findMax(a,b,c);
        System.out.println(mx);
    }
}