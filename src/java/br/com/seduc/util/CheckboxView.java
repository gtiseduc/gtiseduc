package br.com.seduc.util;


 
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class CheckboxView {
         
    private String[] selectedTurmas;
    private List<String> turmas;
     
    @PostConstruct
    public void init() {
        turmas = new ArrayList<String>();
        turmas.add("Turma A");
        turmas.add("Turma B");
        turmas.add("Turma C");
        turmas.add("Turma D");
        turmas.add("Turma E");
        turmas.add("Turma F");
        turmas.add("Turma G");
        turmas.add("Turma H");
        turmas.add("Turma I");
    }
 
    public String[] getSelectedTurmas() {
        return selectedTurmas;
    }
 
    public void setSelectedTurmas(String[] selectedTurmas) {
        this.selectedTurmas = selectedTurmas;
    }
 
  
 
    public List<String> getTurmas() {
        return turmas;
    }
}