public class Scoreboard
{
    private String teamOne = "red";
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam = teamOne;
    public Scoreboard(String one, String two)
    {
        teamOne = one;
        teamTwo = two;
    }
    
    public void recordPlay(int score)
    {

       if (score == 0){
        if (activeTeam == teamOne){
            activeTeam = teamTwo;
        }
        else{
            activeTeam = teamOne;
        }
       }
       else{
        if (activeTeam == teamOne){
            teamOneScore += score;
        }
        else{
            teamTwoScore += score;
       }
    }
}
        public String getScore()
    {
        //teamOne = one;
        //teamTwo = two;
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }
}