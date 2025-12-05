import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns 
df=pd.read_csv("country_vaccinations.csv")
df.head(10)
df.isnull().sum()

missing_value=["N/a","na",np.nan]
df=pd.read_csv("country_vaccinations.csv",na_values=False)
df.isnull().sum()
df.isnull().any()
sns.heatmap(df.isnull(),xticklabels=False,annot=True)
df.head(10)
df.dropna()
df.dropna(how="all")
df.fillna(0)

df.fillna(method="bfill")
df.interpolate()
df_dropped=df.dropna()
df_dropped