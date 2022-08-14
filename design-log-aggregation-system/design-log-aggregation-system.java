class LogAggregator {
    
    int machines, services;

    HashMap<Integer, List<Pair<Integer, String>>> ml;
    HashMap<Integer, List<Pair<Integer, String>>> sl;
    
    public LogAggregator(int machines, int services) {
        this.machines = machines;
        this.services = services;
        ml = new HashMap<>();
        sl = new HashMap<>();
    }
    
    public void pushLog(int logId, int machineId, int serviceId, String message) {
        Pair<Integer, String> log = new Pair<>(logId, message);
        
        ml.putIfAbsent(machineId, new ArrayList<Pair<Integer, String>>());
        sl.putIfAbsent(serviceId, new ArrayList<Pair<Integer, String>>());
        
        ml.get(machineId).add(log);
        sl.get(serviceId).add(log);
        
    }
    
    public List<Integer> getLogsFromMachine(int machineId) {
        List<Integer> answer = new ArrayList<>();
        if(ml.containsKey(machineId)){
            for(Pair<Integer, String> logs : ml.get(machineId)){
                answer.add(logs.getKey());
            }
        }
        return answer;
    }
    
    public List<Integer> getLogsOfService(int serviceId) {
        List<Integer> answer = new ArrayList<>();
        if(sl.containsKey(serviceId)){
            for(Pair<Integer, String> logs : sl.get(serviceId)){
                answer.add(logs.getKey());
            }
        }
        return answer;
    }
    
    public List<String> search(int serviceId, String searchString) {
        List<String> answer = new ArrayList<>();
        if(sl.containsKey(serviceId)){
            for(Pair<Integer, String> logs : sl.get(serviceId)){
                if(logs.getValue().indexOf(searchString) != -1){
                    answer.add(logs.getValue());
                }
            }
        }
        return answer;
    }
}


/**
 * Your LogAggregator object will be instantiated and called as such:
 * LogAggregator obj = new LogAggregator(machines, services);
 * obj.pushLog(logId,machineId,serviceId,message);
 * List<Integer> param_2 = obj.getLogsFromMachine(machineId);
 * List<Integer> param_3 = obj.getLogsOfService(serviceId);
 * List<String> param_4 = obj.search(serviceId,searchString);
 */