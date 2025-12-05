from google.colab import files
uplaoded = files.upload()


import pandas as pd
import numpy as np
from datetime import datetime


import sqlite3

database = 'database.sqlite'

conn = sqlite3.connect(database)

tables = pd.read_sql("""SELECT * 
                    FROM sqlite_master
                    WHERE type='table';""", conn)
tables


team = pd.read_sql("""SELECT * FROM Team""", conn)

team


season = pd.read_sql("""SELECT * FROM Season""", conn)

season


csk_matches_2015 = pd.read_sql("""SELECT Match_Id, Team_2 as Away_Team, Toss_Winner, Match_Winner
                            FROM Match 
                            WHERE Team_1 = 
                            (SELECT Team_1
                            FROM Match
                            WHERE Team_1 == 3 AND Season_Id == 8)""", conn)

print("Matches Played By Chennai Super Kings in Year 2015")
csk_matches_2015


csk_wins = pd.read_sql("""SELECT *
                          FROM Match
                          WHERE Match_Winner == 3 AND Season_Id == 8""", conn)
print("Matches won by CSK as Home Team in Year 2015")
csk_wins


match_runs = pd.read_sql("""SELECT Match_Id, Runs_Scored as Total_Runs, Innings_No
                            FROM Batsman_Scored
                            WHERE Total_Runs > 5 AND Match_Id IN  
                            (SELECT Match_Id
                            FROM Match
                            WHERE Season_Id == 8)""", conn)

print("Matches with Scored Runs Greater Than 5 in Year 2015")
match_runs


avg_runs = pd.read_sql("""SELECT Match_Id, Runs_Scored as Total_Runs, Innings_No
                            FROM Batsman_Scored
                            WHERE Innings_No == 1 AND Runs_Scored > 
                            (SELECT AVG(Runs_Scored)
                            FROM Batsman_Scored)""", conn)

print("Matches with Scored Runs Greater Than Average Scored Runs")
avg_runs








