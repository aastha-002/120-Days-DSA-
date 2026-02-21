class Solution {
    public List<Integer> generateRow(int row){
        long res=1;
        ArrayList<Integer> elementRow = new ArrayList<>();
        elementRow.add(1);
        for(int i=1;i<row;i++){
            res=res*(row-i);
            res=res/i;
            elementRow.add((int)res);
        }
        return elementRow;
    }
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> result=new ArrayList<>();
       for(int i=1;i<=numRows;i++){
        result.add(generateRow(i));
       }
       return result;
    }
}
