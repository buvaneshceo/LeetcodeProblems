1class Solution {
2    public int romanToInt(String s) {
3
4        HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
5         map.put('I', 1);
6         map.put('V', 5); 
7         map.put('X', 10); 
8         map.put('L', 50); 
9         map.put('C', 100); 
10         map.put('D', 500); 
11         map.put('M', 1000); 
12
13         int total=0;
14
15         for(int i=0;i<s.length();i++){
16            Integer current = map.get(s.charAt(i));
17            if(i<s.length()-1){
18                Integer next = map.get(s.charAt(i+1));
19
20                if(current<next){
21                    total-=current;
22                }   
23                else{
24                    total+=current;
25                }     
26            }
27            else{
28            total+=current;
29            }
30         }
31         return total;
32    }
33}