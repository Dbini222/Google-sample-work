package com.google;

import java.util.*;

// error fixing !!

public class VideoPlayer {

  private final VideoLibrary videoLibrary;
  ArrayList<String> videos = new ArrayList<>();
  int count = 0;

  private String getStringOfVideo(Video video){
    String tags = String.join( " ", video.getTags());
    return video.getTitle() + " (" + video.getVideoId() + ") [" + tags + "]";
  }

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos() {
    System.out.println("Here's a list of all available videos:");

    List<Video> videos = videoLibrary.getVideos();
// lexicographical order by title
    videos.sort(Comparator.comparing(Video::getTitle));
    for(Video video : videos){ System.out.println("\t" + getStringOfVideo(video));}
  }
// alot of repeat code, fix later!!!
// maybe make a separate helper function
  public void playVideo(String videoId) {
    ArrayList <String> titles = new ArrayList<String>();
    if(titles.size() > 0){
      System.out.println("Stopping video: " + titles.get(0));
      titles.remove(0);
      titles.add(videoLibrary.getVideo(videoId).getTitle());
    }else{
      titles.add(videoLibrary.getVideo(videoId).getTitle());
      System.out.println("Playing video: " + videoLibrary.getVideo(videoId).getTitle());
    }
    return;
  }

  public void stopVideo() {
    String videoID = videoLibrary.getVideos().get(0).getVideoId();
    Video video = videoLibrary.getVideo(videoID);
    if(video == null){
      System.out.println("Cannot play video: Video does not exist");
    }else {
      System.out.println("Stopping video: " + videos.get(0));
      videos.remove(0);
    }
  }

  public void playRandomVideo() {
    ArrayList<String> IDs = new ArrayList<String>();
    var videos = videoLibrary.getVideos();
    Random random = new Random();
    String randomVideoElement = IDs.get(random.nextInt(IDs.size()));

    for (Video video : videos) {
      IDs.add(video.getVideoId());
    }
    playVideo(randomVideoElement);
    }

  public void pauseVideo() {
    if(videos.size() > 0 && (count > 0)){
      System.out.println("Video already paused: " + videos.get(0));
      return;
    } else if(videos.size() > 0){
      System.out.println("Pausing video: " + videos.get(0));
      count++;
      return;
    }
  }

  public void continueVideo() {
    boolean flag = false;
    int count = 0;
    if((count == 0) && (flag == false)) {
      System.out.println("Cannot continue video: Video is not paused");
    } else if((count >0) && (flag == false)){
      System.out.println("Continuing video: " + videos.get(0));
      flag = true;
    }else if((count > 0) && (flag == true)) {
      System.out.println("Cannot continue video: Video is not paused");
    }else {
      System.out.println("Cannot continue video: No video is currently playing");
    }
  }

  public void showPlaying() {
    System.out.println("showPlaying needs implementation");
  }

  //              PART 2

  public void createPlaylist(String playlistName) {
    //Optional<VideoPlaylist> playlist = findPlaylist(playlistName);
    System.out.println("createPlaylist needs implementation");
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}