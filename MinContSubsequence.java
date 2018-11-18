public class MinContSubsequence {


    List<Integer> amazon(Set<String> targetList, List<String> availableTagsList) {
        List<Integer> res = new LinkedList<>();
        Map<String, List<Integer>> map = new LinkedHashMap<>();
        int index = 0;

        for (String tag : availableTagsList) {
            if(!map.containsKey(tag)) {
                List<Integer> numOfOccurenceList = new ArrayList<>();
                numOfOccurenceList.add(index);
                map.put(tag, numOfOccurenceList);
            } else {
                map.get(tag).add(index);
            }
            index++;
        }

        System.out.println(map.entrySet());

        int j=0;
        for (String target : targetList) {
            if(map.get(target) == null)
                break;
            else {
                List<Integer> indexList = map.get(target);
                int numOfOccurence = indexList.size();
                int resListSize = res.size();
                for (int i=0;i<numOfOccurence;i++) {
                    if(resListSize > 0 && indexList.get(i) < res.get(resListSize-1))
                        res.remove(j++);
                    res.add(indexList.get(i));
                }
            }
        }
        System.out.println(res);
        List<Integer> resultList = new LinkedList<>();
        int first = res.get(0);
        int last = res.get(res.size()-1);
        resultList.add(first);
        resultList.add(last);
        System.out.println(resultList);
        return res;
    }
