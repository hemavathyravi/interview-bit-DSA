public class Solution {
    public int solve(int[] A, int B) {
        int xor=0;
        int x,count=0;
        HashMap<Integer,Integer> mymap = new HashMap<>();
        mymap.put(0,1);
        
        for(int i=0;i<A.length;i++)
        {
            xor=xor^A[i];
            x=xor^B;
            if(mymap.containsKey(x))
            {
                count+=mymap.get(x);
            }
            if(mymap.containsKey(xor))
            {
                mymap.put(xor,mymap.get(xor)+1);
            }
            else
            {
             mymap.put(xor,1);   
            }     
            
            
            
            
        }
        return count;
    }
}
