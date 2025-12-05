import pandas as pd
import numpy as np
import seaborn as sns
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split

from sklearn.linear_model import LinearRegression
%matplotlib inline
HouseDF=pd.read_csv('C:/Users/Karan/Downloads/USA_Housing.csv')

HouseDF.head()
HouseDF.info()
HouseDF.describe()
HouseDF.columns
sns.pairplot(HouseDF)
sns.heatmap(HouseDF.corr(),annot=True)
x=HouseDF[['Avg. Area Income', 'Avg. Area House Age', 'Avg. Area Number of Rooms',
       'Avg. Area Number of Bedrooms', 'Area Population']]

y=HouseDF['Price']
x_train,x_test,y_train,y_test=train_test_split(x,y,test_size=0.40,random_state=101)
x_train
lm=LinearRegression()
lm.fit(x_train,y_train)
coeff_df=pd.DataFrame(lm.coef_,x.columns,columns=['Coefficient'])
coeff_df


predictions=lm.predict(x_test)
plt.scatter(y_test,predictions)
sns.distplot((y_test-predictions),bins=50);

from sklearn import metrics


print('MAE:', metrics.mean_absolute_error(y_test, predictions))
print('MSE:', metrics.mean_squared_error(y_test, predictions))
print('RMSE:', np.sqrt(metrics.mean_squared_error(y_test, predictions)))



