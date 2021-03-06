package com.git.tdgame.gameActor.level;

import java.util.List;

public class LevelModel {
	String name;
	String selectScreenImagePath;
	String mapImagePath;
	String mapPath;
	int gold;
	int baseHealth;
	List<Wave> waveList;
	int levelIndex;
	
	public String getMapImagePath() {
		return mapImagePath;
	}
	public void setMapImagePath(String mapImagePath) {
		this.mapImagePath = mapImagePath;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSelectScreenImagePath() {
		return selectScreenImagePath;
	}
	public void setSelectScreenImagePath(String selectScreenImagePath) {
		this.selectScreenImagePath = selectScreenImagePath;
	}
	public String getMapPath() {
		return mapPath;
	}
	public void setMapPath(String mapPath) {
		this.mapPath = mapPath;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getBaseHealth() {
		return baseHealth;
	}
	public void setBaseHealth(int baseHealth) {
		this.baseHealth = baseHealth;
	}
	public List<Wave> getWaveList() {
		return waveList;
	}
	public void setWaveList(List<Wave> waveList) {
		this.waveList = waveList;
	}
	@Override
	public String toString() {
		return "LevelModel [name=" + name + ", selectScreenImagePath="
				+ selectScreenImagePath + ", mapPath=" + mapPath + ", gold="
				+ gold + ", baseHealth=" + baseHealth + ", waveList="
				+ waveList + "]";
	}
	public int getLevelIndex() {
		return levelIndex;
	}
	public void setLevelIndex(int levelIndex) {
		this.levelIndex = levelIndex;
	}
	
	
}
