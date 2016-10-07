/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grupo4;

import robocode.TeamRobot;

/**
 *
 * @author ribadas
 */
public class EstadoRobot {
    private final double distanceRemaining;
    private final double energy;
    private final double gunHeading;
    private final double gunHeat;
    private final double gunTurnRemaining;
    private final double heading;
    private final int numRounds;
    private final int others;
    private final double radarHeading;
    private final double radarTurnRemaining;
    private final int roundNum;
    private final long time;
    private final double y;
    private final double turnRemaining;
    private final double velocity;
    private final double x;
    private final String[] team;
    public EstadoRobot(TeamRobot robot){
        distanceRemaining = robot.getDistanceRemaining();
        energy = robot.getEnergy();
        gunHeading = robot.getGunHeading();
        gunHeat = robot.getGunHeat();
        gunTurnRemaining = robot.getGunTurnRemaining();
        heading = robot.getHeading();
        numRounds = robot.getNumRounds();
        others = robot.getOthers();
        radarHeading = robot.getRadarHeading();
        radarTurnRemaining = robot.getRadarTurnRemaining();
        roundNum = robot.getRoundNum();
        time = robot.getTime();
        turnRemaining = robot.getTurnRemaining();
        velocity = robot.getVelocity();
        x = robot.getX();
        y = robot.getY();
        team=robot.getTeammates();
    }

    public double getDistanceRemaining() {
        return distanceRemaining;
    }
    public boolean isNotTeammate(String s){
    	for(int i=0;i<team.length;i++)if(s.equals(team[i]))return false;
    	return true;
    }
    public double getEnergy() {
        return energy;
    }

    public double getGunHeading() {
        return gunHeading;
    }

    public double getGunHeat() {
        return gunHeat;
    }

    public double getGunTurnRemaining() {
        return gunTurnRemaining;
    }

    public double getHeading() {
        return heading;
    }
    public double getHeadingRadians() {
        return 2*3.1416*heading/360;
    }

    public int getNumRounds() {
        return numRounds;
    }

    public int getOthers() {
        return others;
    }

    public double getRadarHeading() {
        return radarHeading;
    }

    public double getRadarTurnRemaining() {
        return radarTurnRemaining;
    }

    public int getRoundNum() {
        return roundNum;
    }

    public long getTime() {
        return time;
    }

    public double getTurnRemaining() {
        return turnRemaining;
    }

    public double getVelocity() {
        return velocity;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString(){
    	return "Estado(x:"+x+", y:"+y+", velocity:"+velocity+
    	                     ", energy:"+energy+", heading:"+heading+
    	                     ", distanceRemaining:"+distanceRemaining+")";
    	
    }

}
