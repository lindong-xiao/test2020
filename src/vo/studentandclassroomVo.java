package vo;

public class studentandclassroomVo {
    private Integer snum;
    private String sname;
    private Integer cclassroomnum;
    private String cname;

    public studentandclassroomVo(Integer snum, String sname, Integer cclassroomnum, String cname) {
        this.snum = snum;
        this.sname = sname;
        this.cclassroomnum = cclassroomnum;
        this.cname = cname;
    }

    public studentandclassroomVo() {
    }

    public Integer getSnum() {
        return snum;
    }

    public void setSnum(Integer snum) {
        this.snum = snum;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getCclassroomnum() {
        return cclassroomnum;
    }

    public void setCclassroomnum(Integer cclassroomnum) {
        this.cclassroomnum = cclassroomnum;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "studentandclassroomVo{" +
                "snum=" + snum +
                ", sname='" + sname + '\'' +
                ", cclassroomnum=" + cclassroomnum +
                ", cname='" + cname + '\'' +
                '}';
    }
}
