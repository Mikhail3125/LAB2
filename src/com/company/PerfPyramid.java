package com.company;

import lombok.Getter;
import lombok.Setter;

public class PerfPyramid extends Square {
    @Getter @Setter double side;

    public PerfPyramid(double side){this.side =side;}
    public PerfPyramid(){
        side=0;
    }
}
