class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result = new ArrayList<>();
        String prefix = new String(); 
        for(char c: searchWord.toCharArray()){
            prefix +=c;
            int i = 0;
            List<String> subList = new ArrayList<>();
            for(String product: products){
                    if(product.startsWith(prefix)){
                        subList.add(product);
                        i++;
                    }
                    if(i == 3){
                        i = 0;
                        break;
                        
                    }
                
            }
            result.add(subList);
        }
        return result;
    }
}