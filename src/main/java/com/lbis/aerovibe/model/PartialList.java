/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lbis.aerovibe.model;

import java.util.LinkedList;

/**
 *
 * @author Assraf
 * @param <LISTTYPE>
 */
public class PartialList<LISTTYPE> {
    
    LinkedList<LISTTYPE> partialListList;
    int partialListSumOfLists;
    int partialListCount;
    
    public final static String PAGE = "page";

    public LinkedList<LISTTYPE> getPartialListList() {
        return partialListList;
    }

    public void setPartialListList(LinkedList<LISTTYPE> partialListList) {
        this.partialListList = partialListList;
    }

    public int getPartialListSumOfLists() {
        return partialListSumOfLists;
    }

    public void setPartialListSumOfLists(int partialListSumOfLists) {
        this.partialListSumOfLists = partialListSumOfLists;
    }

    public int getPartialListCount() {
        return partialListCount;
    }

    public void setPartialListCount(int partialListCount) {
        this.partialListCount = partialListCount;
    }
    
}
