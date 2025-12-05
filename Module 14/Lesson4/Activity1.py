from google.colab import files
Files= files.upload()

import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt
import numpy as np


df=pd.read_csv("USA_Housing.csv")
df.head(10)
df.info()
df.describe()
df.columns
sns.pairplot(df)
sns.heatmap(df.corr(),annot=True)
