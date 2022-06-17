import numpy
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

path = 'ex1data1.txt'
data = pd.read_csv(path, header=None, names=['Population', 'Profit'])
print(data.head())
print(data.describe())
data.plot(kind='scatter', x='Population', y='Profit', figsize=(12, 8))
plt.show()
print(type(data))


def compute_cost(x, y, theta):
    inner = np.power(((x * theta.T) - y), 2)
    return np.sum(inner) / (2 * len(x))


data.insert(0, 'Ones', 1)
# print(data.head())
# set X (training data) and y (target variable)
print(data.shape)
cols = data.shape[1]
X = data.iloc[:, 0:cols - 1]  # X是所有行，去掉最后一列
y = data.iloc[:, cols - 1:cols]  # X是所有行，最后一列
# print(X.head())

X = np.matrix(X.values)
y = np.matrix(y.values)
theta = np.matrix(np.array([0, 0]))
print(theta)
print(X)

print(compute_cost(X, y, theta))
