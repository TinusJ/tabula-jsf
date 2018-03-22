package org.tinusj.tabula;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Tinus
 */
@Named
@ViewScoped
public class UploadBean implements Serializable {

    private UploadedFile file;

    public void handleFileUpload(FileUploadEvent event) {
        file = event.getFile();
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

}
