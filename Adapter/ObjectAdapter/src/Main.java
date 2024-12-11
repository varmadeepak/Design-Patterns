// TARGET_INTERFACE
interface AnalyticsTool{
    void analyzeData();
}

// ADAPTER

class XMLToJSONAdapter implements AnalyticsTool{
    private JsonAnalyticsTool jsonAnalyticsTool;

    public XMLToJSONAdapter(String xmlData){
        System.out.println("Converting xml to json");
        String newData = xmlData + "json Format";
        jsonAnalyticsTool = new JsonAnalyticsTool();
        jsonAnalyticsTool.setJsonData(newData);
    }

    @Override
    public void analyzeData() {
        jsonAnalyticsTool.analyzeData();
    }
}

// ADAPTEE
class JsonAnalyticsTool{
    private String jsonData;

    public void setJsonData(String jsonData){
        this.jsonData = jsonData;
    }

    public void analyzeData(){
        if(jsonData.contains("json")){
            System.out.println("Analyzing data  :  " + jsonData);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        AnalyticsTool analyticsTool = new XMLToJSONAdapter("Old_Data ");
        analyticsTool.analyzeData();
    }
}