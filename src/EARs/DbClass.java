
package EARs;

public class DbClass {
    
    private int id;
    private String eName;
    private String eId;
    private String entryTime;
    private String leaveTime;
    private String date;
    
    public DbClass(int ID,String Name,String Id,String Entry,String Leave,String Date){
        
        this.id=ID;
        this.eName=Name;
        this.eId=Id;
        this.entryTime=Entry;
        this.leaveTime=Leave;
        this.date=Date;
    }
    public int getIdCons(){
        return id;
    }
    public String getName(){
        return eName;
    }
    public String getId(){
        return eId;
    }
    public String getEntryTime(){
        return entryTime;
    }
    public String getLeaveTime(){
        return leaveTime;
    }
    public String getDate(){
        return date;
    }
}
