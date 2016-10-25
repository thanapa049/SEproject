package com.example.plern.addnotice;

import android.media.Image;

import java.util.ArrayList;

/**
 * Created by Thara on 15/10/2559.
 */

public class Place {
    private int placeId;
    private String placeName;
    private Double placeLocation;
    private String placeAddress;
    private String placeTel;
    private String placeDetail;
    private String placeWebsite;
    private String placeFacebook;
    private String placeLine;
    private String placeIg;
    private int placeStarAvg;
    private Double placePrice;
    private int reviewerAmount;
    private String placeWorkDay;
    private ArrayList<Image> placePhoto;

    public Place(String placeName, String placeAddress, Double placeLocation, String placeTel,
                 String placeDetail, String placeWebsite, String placeFacebook, String placeLine,
                 String placeIg, Double placePrice, String placeWorkDay){
        this.placeName = placeName;
        this.placeAddress = placeAddress;
        this.placeLocation = placeLocation;
        this.placeTel = placeTel;
        this.placeDetail = placeDetail;
        this.placeWebsite = placeWebsite;
        this.placeFacebook = placeFacebook;
        this.placeLine = placeLine;
        this.placeIg = placeIg;
        this.placePrice = placePrice;
        this.placeWorkDay = placeWorkDay;
        this.placePhoto = placePhoto;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public Double getPlaceLocation() {
        return placeLocation;
    }

    public void setPlaceLocation(Double placeLocation) {
        this.placeLocation = placeLocation;
    }

    public ArrayList<Image> getPlacePhoto() {
        return placePhoto;
    }

    public void setPlacePhoto(ArrayList<Image> placePhoto) {
        this.placePhoto = placePhoto;
    }

    public String getPlaceWorkDay() {
        return placeWorkDay;
    }

    public void setPlaceWorkDay(String placeWorkDay) {
        this.placeWorkDay = placeWorkDay;
    }

    public Double getPlacePrice() {
        return placePrice;
    }

    public void setPlacePrice(Double placePrice) {
        this.placePrice = placePrice;
    }

    public String getPlaceIg() {
        return placeIg;
    }

    public void setPlaceIg(String placeIg) {
        this.placeIg = placeIg;
    }

    public String getPlaceLine() {
        return placeLine;
    }

    public void setPlaceLine(String placeLine) {
        this.placeLine = placeLine;
    }

    public String getPlaceFacebook() {
        return placeFacebook;
    }

    public void setPlaceFacebook(String placeFacebook) {
        this.placeFacebook = placeFacebook;
    }

    public String getPlaceWebsite() {
        return placeWebsite;
    }

    public void setPlaceWebsite(String placeWebsite) {
        this.placeWebsite = placeWebsite;
    }

    public String getPlaceDetail() {
        return placeDetail;
    }

    public void setPlaceDetail(String placeDetail) {
        this.placeDetail = placeDetail;
    }

    public String getPlaceTel() {
        return placeTel;
    }

    public void setPlaceTel(String placeTel) {
        this.placeTel = placeTel;
    }

    public int getPlaceStarAvg() {
        return placeStarAvg;
    }

    public void setPlaceStarAvg(int placeStarAvg) {
        this.placeStarAvg = placeStarAvg;
    }

    public int getReviewerAmount() {
        return reviewerAmount;
    }

    public void setReviewerAmount(int reviewerAmount) {
        this.reviewerAmount = reviewerAmount;
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public void setPlaceAddress(String placeAddress) {
        this.placeAddress = placeAddress;
    }
}
