% Find the centroid from data testing
[centers,U] = fcm(M,7);
maxU = max(U);

% Spare into 8 clusters
index1 = find(U(1,:) == maxU);
index2 = find(U(2,:) == maxU);
index3 = find(U(3,:) == maxU);
index4 = find(U(4,:) == maxU);
index5 = find(U(5,:) == maxU);
index6 = find(U(6,:) == maxU);
index7 = find(U(7,:) == maxU);

% Show the clusters
hold on
plot(M(index1,1),M(index1,2),'ob')
plot(M(index2,1),M(index2,2),'or')
plot(M(index3,1),M(index3,2),'og')
plot(M(index4,1),M(index4,2),'oy')
plot(M(index5,1),M(index5,2),'om')
plot(M(index6,1),M(index6,2),'oc')
plot(M(index7,1),M(index7,2),'ok')
plot(centers(1,1),centers(1,2),'xb','MarkerSize',15,'LineWidth',3)
plot(centers(2,1),centers(2,2),'xr','MarkerSize',15,'LineWidth',3)
plot(centers(3,1),centers(3,2),'xg','MarkerSize',15,'LineWidth',3)
plot(centers(4,1),centers(4,2),'xy','MarkerSize',15,'LineWidth',3)
plot(centers(5,1),centers(5,2),'xm','MarkerSize',15,'LineWidth',3)
plot(centers(6,1),centers(6,2),'xc','MarkerSize',15,'LineWidth',3)
plot(centers(7,1),centers(7,2),'xk','MarkerSize',15,'LineWidth',3)
hold off