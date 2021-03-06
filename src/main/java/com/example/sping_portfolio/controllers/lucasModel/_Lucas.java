package com.example.sping_portfolio.controllers.lucasModel;

import com.example.sping_portfolio.consoleUI.ConsoleMethods;


import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;

import lombok.Getter;

@Getter
public abstract class _Lucas {
    int size;
    String name;
    int hashID;
    Duration timeElapsed;
    ArrayList<Long> list;
    HashMap<Integer, Object> hash;

    /*
     Construct the nth com.tri3.nighthawk.lucas number
     @param: nth constrained to 92 because of maximum long
     */
    public _Lucas() {
        this( 20);
    }

    public _Lucas(int nth) {
        this.size = nth;
        this.list = new ArrayList<>();
        this.hashID = 0;
        this.hash = new HashMap<>();
        //initialize lucas and time algorithm
        Instant start = Instant.now();  // time capture -- start
        this.init();
        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);
    }

    protected abstract void init();

    public void setData(long num) {
        list.add(num);
        hash.put(this.hashID++, list.clone());
    }

    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }

    public long getNth() {
        return list.get(size - 1);
    }

    public Object getNthSeq(int i) {
        return hash.get(i);
    }

    public ArrayList<Long> getList() {
        return list;
    }

    public HashMap<Integer, Object> getHash() {
        return hash;
    }

    public void print() {
        ConsoleMethods.println("Init method = " + this.name);
        ConsoleMethods.println("Init time = " + this.getTimeElapsed());
        ConsoleMethods.println("Lucas Number " + this.size + " = " + this.getNth());
        ConsoleMethods.println("Lucas List = " + this.getList());
        ConsoleMethods.println("Lucas Hashmap = " + this.getHash());
        for (int i=0 ; i<this.size; i++ ) {
            ConsoleMethods.println("Lucas Sequence " + (i+1) + " = " + this.getNthSeq(i));
        }
    }
}