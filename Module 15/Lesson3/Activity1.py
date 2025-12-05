import pandas as pd
import matplotlib.pyplot as plt
countries_df = pd.read_csv('countries.csv')

countries = countries_df

countries.head(3)
c_52 = countries.loc[countries['year'] == 1952]
c_52.head()

c_07 = countries.loc[countries['year'] == 2007]
c_07.head()

type(c_52)

c_merge = c_52.merge(c_07, left_on='country', right_on='country')
c_merge.head()

c_merge.drop(['year_x', 'year_y'], axis=1)
c_merge.head()
c_merge['population_growth'] = c_merge['population_y'] - c_merge['population_x']
c_merge.shape, type(c_merge)
c_merge = c_merge.sort_values('population_growth', ascending=False).head(10)
c_merge.head(10)
c_merge = c_merge.reset_index()
c_merge.shape
c_merge = c_merge.drop(['index'], axis=1)
c_merge.shape
c_merge
names = ['China', 'India', 'United States', 'Indonesia', 'Brazil', 'Pakistan', 'Bangledesh', 'Nigeria', 'Mexico', 'Philippines']
pop_grow = (c_merge['population_growth'] / 10**6)

plt.figure(figsize=(15,9))
plt.bar(names,pop_grow,width=0.6)
plt.xlabel('Country')
plt.ylabel('Population Growth (Millions)')
plt.title('Top 10 Countries w/the Biggest Population Growth from 1952 to 2007')
plt.xticks(rotation=45)

# zip joins x and y coordinates in pairs
for x,y in zip(names,pop_grow):

    label = "{:.2f}".format(y)

    plt.annotate(label, # this is the text
                 (x,y), # this is the point to label
                 textcoords="offset points", # how to position the text
                 xytext=(0,10), # distance from text to points (x,y)
                 ha='center') # horizontal alignment can be left, right or center

plt.show()
