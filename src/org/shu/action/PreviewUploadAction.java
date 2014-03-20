package org.shu.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.tool.CommonParam;

import com.opensymphony.xwork2.ActionContext;

import common.base.action.BaseAction;

@SuppressWarnings("serial")
public class PreviewUploadAction extends BaseAction {
    
    private File upload;
    private String uploadFileName;
    
    public File getUpload() {
        return upload;
    }
    
    public void setUpload(File upload) {
        this.upload = upload;
    }
    
    public String getUploadFileName() {
        return uploadFileName;
    }
    
    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }
    
    public String execute() throws Exception {
        CommonParam cp = new CommonParam();
        String uploadpath = cp.getString("Server_upload_path");
        String reportId = request.getParameter("reportId");
        String extName = uploadFileName.substring(uploadFileName.lastIndexOf('.'), uploadFileName.length());
        if (upload != null) {
            InputStream is = new FileInputStream(upload);
            OutputStream os =
                    new FileOutputStream(uploadpath + reportId + extName);
            byte buffer[] = new byte[1024];
            int count = 0;
            while ((count = is.read(buffer)) > 0) {
                os.write(buffer, 0, count);
            }
            os.close();
            is.close();
        }
        Map<String, String> request = (Map<String, String>)ActionContext.getContext().get("request");
        request.put("fileName", reportId + extName);
        return SUCCESS;
    }
}
