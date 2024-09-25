public class Scoreboard
{
    private String teamOne = "red";
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;
    public Scoreboard(String one, String two)
    {
        teamOne = one;
        teamTwo = two;
    }

        public String getScore()
    {
        //teamOne = one;
        //teamTwo = two;
        activeTeam = teamOne;
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }

        public void recordPlay(int score)
    {
       activeTeam += score;
    }


}
