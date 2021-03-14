package vn.com.hunghd.hw;

import java.util.Objects;

public class Line {

    private Point sp;
    private Point ep;

    public Line() {
    }

    public Line(Point sp, Point ep) {
        this.sp = sp;
        this.ep = ep;
    }

    public Line(float spx, float spy, float epx, float epy){
        sp = new Point(spx, spy);
        ep = new Point(epx, epy);
    }

    public Point getSp() {
        return sp;
    }

    public void setSp(Point sp) {
        this.sp = sp;
    }

    public Point getEp() {
        return ep;
    }

    public void setEp(Point ep) {
        this.ep = ep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(sp, line.sp) &&
                Objects.equals(ep, line.ep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sp, ep);
    }

    @Override
    public String toString() {
        return "Line{" +
                "sp=" + sp +
                ", ep=" + ep +
                '}';
    }
}
