public class Solution {
    /**
     * @param pid: the process id
     * @param ppid: the parent process id
     * @param kill: a PID you want to kill
     * @return: a list of PIDs of processes that will be killed in the end
     */
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        // Write your code here
        int n = ppid.size();
        HashMap<Integer, List<Integer>> map = new HashMap<Integer,List<Integer>>();

        for (int i=0;i<n;i++) {
            List<Integer> tmp;
            int id = ppid.get(i);
            if (map.containsKey(id)) {
                tmp = map.get(id);

            } else {
                tmp = new ArrayList<Integer>();

            }
            tmp.add(pid.get(i));
            map.put(id,tmp);
        }

        List<Integer> list = new ArrayList<Integer>();
        list.add(kill);

        int i = 0;
        while(i<list.size()) {
            int id = list.get(i);
            if (map.containsKey(id)) {
                list.addAll(map.get(id));
            }
            i++;
        }

        return list;
    }
}
