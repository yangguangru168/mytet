package listandmap;

import java.util.*;

/**
 * @author 杨光儒
 * @Title: landm
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/719:01
 */
public class landm {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<50;i++){
            list.add((int)(Math.random()*100));
        }
        Map<Integer,ArrayList<Integer>> map = getMap(list);
        System.out.print(map+" ");
        System.out.println();
        Map<Integer,ArrayList<Integer>> sortmap = getSort(map);
        System.out.print("排序后"+sortmap+" ");
    }

    private static Map<Integer,ArrayList<Integer>> getMap(List<Integer> list){
        Map<Integer,ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

        for (Integer intg : list){
            int key = intg/10;
            if (map.get(key)==null){
                ArrayList<Integer> list1 = new ArrayList<Integer>();
                list1.add(intg);
                map.put(key,list1);
            }
            else{
                 map.get(key).add(intg);
            }
        }
        return map;
    }
    private static Map<Integer,ArrayList<Integer>> getSort(Map<Integer,ArrayList<Integer>> sortmap){
        Map<Integer,ArrayList<Integer>> sortaa = new TreeMap<Integer, ArrayList<Integer>>();
        sortaa.putAll(sortmap);
        return sortaa;
    }
}
