import com.alibaba.excel.EasyExcel;

import java.time.LocalDate;
import java.util.*;

/**
 * @author pengjun
 * @create 2021-03-22 19:33
 */
public class main {

    public static void main(String[] args) {
        String path = "D:/1.xls";
        List<Map<String, Object>> sourceData = getData();
        List<List<String>> workData =new ArrayList<>();
        List<List<String>> headList = new ArrayList<>();
//        headList.add(Arrays.asList("123"));
        for(int i=0;i<sourceData.size();i++){
            headList.add(Arrays.asList((String)sourceData.get(i).get("applicate_name"), (String)sourceData.get(i).get("proce_name")));
            List<String> list  =new ArrayList<>();
            for(int j = 0;j<i;j++){
                list.add("");
            }
            list.add(String.valueOf(sourceData.get(i).get("proce_sum")));
            workData.add(list);
        }
        EasyExcel.write(path, TestBean.class).head(headList).sheet("模板").doWrite(workData);
    }

    public static List<Map<String, Object>> getData(){
        List<Map<String , Object >> list = new ArrayList<>();
        int date = LocalDate.of(2021,05,1).getMonth().maxLength();
        for(int i =1 ;i<=date ; i++){
            for(int j =0 ;j<date;j++){
                Map<String, Object > map = new HashMap<>();
                map.put("work_date",05+"月"+i+"日");
                map.put("applicate_name","测试人员");
                map.put("proce_name","工序名字"+i);
                map.put("proce_sum",i+j);
                list.add(map);
            }

        }
    return list;
    }
}
