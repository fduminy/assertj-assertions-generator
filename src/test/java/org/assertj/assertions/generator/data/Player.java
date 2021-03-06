/*
 * Created on Feb 22, 2011
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2011 the original author or authors.
 */
package org.assertj.assertions.generator.data;

import static java.lang.String.format;

import static org.assertj.core.util.Objects.areEqual;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Joel Costigliola
 */
public class Player {

  private Name name;
  private boolean rookie;
  private int pointsPerGame;
  private int assistsPerGame;
  private int reboundsPerGame;
  private String team;
  private List<Player> teamMates = new ArrayList<Player>();
  private String[] previousTeams = {};

  public Player(Name name, String team) {
    setName(name);
    setTeam(team);
  }

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public int getPointsPerGame() {
    return pointsPerGame;
  }

  public void setPointsPerGame(int pointsPerGame) {
    this.pointsPerGame = pointsPerGame;
  }

  public int getAssistsPerGame() {
    return assistsPerGame;
  }

  public void setAssistsPerGame(int assistsPerGame) {
    this.assistsPerGame = assistsPerGame;
  }

  public int getReboundsPerGame() {
    return reboundsPerGame;
  }

  public void setReboundsPerGame(int reboundsPerGame) {
    this.reboundsPerGame = reboundsPerGame;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public List<Player> getTeamMates() {
    return teamMates;
  }

  public void setTeamMates(List<Player> teamMates) {
    this.teamMates = teamMates;
  }

  public String[] getPreviousTeams() {
    return previousTeams;
  }
  
  public void setPreviousTeams(String[] previousTeams) {
    this.previousTeams = previousTeams;
  }

  public boolean isRookie() {
    return rookie;
  }
  
  public void setRookie(boolean rookie) {
    this.rookie = rookie;
  }
  
  public boolean isInTeam(String team) {
    return areEqual(this.team, team);
  }
  
  // for testing only
  public void getVoid() {
    // empty
  }

  // for testing only
  public String get() {
    return "something";
  }
  
  // for testing only
  public String is() {
    return "somebody";
  }
  
  // for testing only
  public String getWithParam(String param) {
    return param;
  }
  
  // for testing only
  public void isVoid() {
    // empty
  }
  
  // for testing only
  public String isWithParam(String param) {
    return param;
  }
  
  @Override
  public String toString() {
    return format("%s[%s %s, team=%s]", getClass().getSimpleName(), name.getFirst(), name.getLast(), team);
  }
}
