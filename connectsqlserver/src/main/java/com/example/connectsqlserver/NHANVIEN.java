package com.example.connectsqlserver;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.util.Date;

@Table(name = "dbo.NHANVIEN")
public class NHANVIEN {
    @Id
    @Column(name = "MANHANVIEN")
    private int MANHANVIEN;
    @Column(name = "HO")
    private String HO;
    @Column(name = "TEN")
    private String TEN;
    @Column(name = "NGAYSINH")
    private Date NGAYSINH;

    @Override
    public String toString() {
        return "NHANVIEN{" +
                "MANHANVIEN=" + MANHANVIEN +
                ", HO='" + HO + '\'' +
                ", TEN='" + TEN + '\'' +
                ", NGAYSINH=" + NGAYSINH +
                '}';
    }

    public NHANVIEN(int MANHANVIEN, String HO, String TEN, Date NGAYSINH) {
        this.MANHANVIEN = MANHANVIEN;
        this.HO = HO;
        this.TEN = TEN;
        this.NGAYSINH = NGAYSINH;
    }

    public NHANVIEN() {
    }

    public int getMANHANVIEN() {
        return MANHANVIEN;
    }

    public void setMANHANVIEN(int MANHANVIEN) {
        this.MANHANVIEN = MANHANVIEN;
    }

    public String getHO() {
        return HO;
    }

    public void setHO(String HO) {
        this.HO = HO;
    }

    public String getTEN() {
        return TEN;
    }

    public void setTEN(String TEN) {
        this.TEN = TEN;
    }

    public Date getNGAYSINH() {
        return NGAYSINH;
    }

    public void setNGAYSINH(Date NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }
}
