import java.awt.*;

public class SecretaryGeneral {
    
    private String  name;
    private Integer startYear, endYear;
    private Boolean isStillAlive;
    
    
    // constructor
    public SecretaryGeneral( String n, Integer sY, Integer eY, Boolean living ) {
        name = n;
        startYear = sY;
        endYear = eY;
        isStillAlive = living;
    } // end of constructor
    
    
    // getters
    
    public String getName() {
        return name;
    } // end of getName
    
    public Integer getStartYear() {
        return startYear;
    } // end of getStartYear
    
    public Integer getEndYear() {
        return endYear;
    } // end of getEndYear

    public Boolean getIsStillAlive() {
        return isStillAlive;
    } // end of getIsStillAlive()

    

    public String toString() {
        String answer;
        
        answer = name + ", who is ";
        if (isStillAlive) {
            answer += "still alive, ";
        }
        else {
            answer += "no longer living, ";
        }
        answer += "was Secretary-General of the UN from " + startYear + " to " + endYear + ".";
                
        return answer;
    } // end of toString
    
    
} // end of class SecretaryGeneral
