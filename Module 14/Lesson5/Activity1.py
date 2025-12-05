from google.colab import files
Files= files.upload()

import pandas as pd
import seaborn as sns

weather = pd.read_csv('Trial Activity DataSet.csv')
weather.info()
sns.barplot(weather['wind_speed'], weather['temperature'])

sns.distplot(weather['temperature'])

sns.distplot(weather['humidity'], rug=True);

sns.jointplot(weather['humidity'], weather['temperature'])

sns.jointplot(weather['humidity'], weather['temperature'], kind="hex")

sns.jointplot(weather['humidity'], weather['temperature'], kind="kde")

sns.pairplot(weather[['humidity', 'temperature', 'air_pollution_index']])

sns.stripplot(weather['weather_type'], weather['temperature'])

sns.swarmplot(weather['humidity'], weather['temperature'])

sns.boxplot(weather['humidity'], weather['temperature'], hue=weather['weather_type'])

sns.barplot(weather['humidity'], weather['temperature'], hue=weather['weather_type'])

sns.countplot(weather['weather_type'])

sns.pointplot(weather['humidity'], weather['temperature'], hue=weather['weather_type'])

sns.lmplot(x="humidity", y="temperature", data=weather)
sns.lmplot(x="humidity", y="temperature", hue="weather_type", data=weather)