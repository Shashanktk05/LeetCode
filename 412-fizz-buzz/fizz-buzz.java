class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<String>(n);
        //  System.out.print(l.size());

        for(int i=1;i<n+1;i++){
            if(i%3==0 && i%5==0){
                l.add("FizzBuzz");
            }else if(i%3==0){
                l.add("Fizz");
            }else if(i%5==0){
                l.add("Buzz");
            }else{
                l.add(i+"");
            }
            
        }
           return l;
    }
}