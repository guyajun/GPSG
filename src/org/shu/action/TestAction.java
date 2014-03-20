package org.shu.action;

import java.util.List;
import java.util.Map;

import org.shu.common.service.MaterialService;
import org.shu.construct.service.SynService;
import org.shu.model.ProInfo;
import org.shu.service.TestIService;
import org.shu.service.imp.GpTotalInfoService;
import org.shu.service.imp.ProInfoService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class TestAction extends ActionSupport {
    
//    private ProInfo proInfo;
//    private ProInfoService proInfoService;
//    private List list;
//    private TestIService testService;
//    private MaterialService materialService;
//    private ManufacturerService manufacturerService;
//    private GpTotalInfoService gpTotalInfoService;
//    private SynService synService;
//    
//    public void setSynService(SynService synService) {
//        this.synService = synService;
//    }
//    
//    public void setGpTotalInfoService(GpTotalInfoService gpTotalInfoService) {
//        this.gpTotalInfoService = gpTotalInfoService;
//    }
//    
//    public void setManufacturerService(ManufacturerService manufacturerService) {
//        this.manufacturerService = manufacturerService;
//    }
//    
//    public void setMaterialService(MaterialService materialService) {
//        this.materialService = materialService;
//    }
//    
//    public void setTestService(TestIService testService) {
//        this.testService = testService;
//    }
//    
//    public ProInfo getProInfo() {
//        return proInfo;
//    }
//    
//    public void setProInfo(ProInfo proInfo) {
//        this.proInfo = proInfo;
//    }
//    
//    public void setProInfoService(ProInfoService proInfoService) {
//        this.proInfoService = proInfoService;
//    }
//    
//    public List getList() {
//        return list;
//    }
//    
//    public void setList(List list) {
//        this.list = list;
//    }
//    
//    public TestIService getTestService() {
//        return testService;
//    }
//    
//    @SuppressWarnings({ "unchecked", "rawtypes" })
//    public String testMenu() throws Exception {
//        List steelQual = materialService.steelQuality();
//        List listpro = proInfoService.getAll();
//        List listuser = proInfoService.getAllUser();
//        List menus = testService.getAllCatalogs();
//        List depts = testService.getAllDepts();
//        List roles = testService.getAllRoles();
//        List pros = testService.getAllPros();
//        List qualdata = manufacturerService.getAll();
//        Map request = (Map)ActionContext.getContext().get("request");
//        request.put("steelQual", steelQual);
//        request.put("listpro", listpro);
//        request.put("listuser", listuser);
//        request.put("menus", menus);
//        request.put("depts", depts);
//        request.put("roles", roles);
//        request.put("pros", pros);
//        request.put("qualdata", qualdata);
//        return SUCCESS;
//    }
//    
//    @SuppressWarnings({ "unchecked", "rawtypes" })
//    public String baseInfo() throws Exception {
//        Integer id = 1;
//        List infos = testService.getBaseInfo(id);
//        Map request = (Map)ActionContext.getContext().get("request");
//        request.put("infos", infos);
//        return SUCCESS;
//    }
//    
//    public String lastedInfo() throws Exception {
//        int planGpCount=proInfoService.getLastLoop();
//        int tunnelLoop=synService.getLastLoop();
//        int loop = gpTotalInfoService.getLastLoop();
//        Map request = (Map)ActionContext.getContext().get("request");
//        request.put("loop", loop + "");
//        request.put("tunnelLoop", tunnelLoop + "");
//        request.put("planGpCount", planGpCount + "");
//        return SUCCESS;
//    }
}
