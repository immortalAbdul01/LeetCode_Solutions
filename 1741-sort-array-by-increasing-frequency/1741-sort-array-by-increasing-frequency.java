class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
		for(int x : nums)
		    map.put(x, map.getOrDefault(x,0)+1);
		Map<Integer, ArrayList<Integer>> res = new TreeMap<>();
		
		for(int i = 1; i<=nums.length; i++){
		    ArrayList<Integer> ar = new ArrayList<>();
		    for(Map.Entry<Integer, Integer> key : map.entrySet()){
		        if(i==key.getValue())
		            ar.add(key.getKey());
		    }
		    if(!ar.isEmpty()){
		        Collections.sort(ar, Collections.reverseOrder());
		        res.put(i, ar);
		    }
		}		
		
		List<Integer> ls = new ArrayList<>();		
		for(Map.Entry<Integer, ArrayList<Integer>> key : res.entrySet()){
		    for(int x : key.getValue()){
		        for(int i = 1; i<=key.getKey(); i++)
		            ls.add(x);
		    }
		}
        return ls.stream().mapToInt(i->i).toArray();
    }
}