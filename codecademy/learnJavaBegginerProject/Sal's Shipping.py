#   This is a program that will take the weight of a package and determine the cheapest way
#   to ship that package using Sal's Shippers.

#   Ground Shipping
#   Weight of Package	Price per Pound	Flat Charge
#   2 lb or less	$1.50	$20.00
#   Over 2 lb but less than or equal to 6 lb	$3.00	$20.00
#   Over 6 lb but less than or equal to 10 lb	$4.00	$20.00
#   Over 10 lb	$4.75	$20.00

#   Ground Shipping Premium
#   Flat charge : $125.00

#   Drone Shipping
#   Weight of Package	Price per Pound	Flat Charge
#   2 lb or less	$4.50	$0.00
#   Over 2 lb but less than or equal to 6 lb	$9.00	$0.00
#   Over 6 lb but less than or equal to 10 lb	$12.00	$0.00
#   Over 10 lb	$14.25	$0.00

#   Sal's Shippers options
#   Ground Shipping, which is a small flat charge plus a rate based on the weight of your package.
#   Ground Shipping Premium, which is a much higher flat charge, but you aren’t charged for weight.
#   Drone Shipping (new), which has no flat charge, but the rate based on weight is triple the rate of ground shipping.


# Weight of Package
weight = 4.8


# Ground Shipping 
if weight <= 2 :
    cost_ground = weight * 1.5 + 20
elif 2 < weight <= 6 :
    cost_ground = weight * 3.0 + 20
elif 6 < weight <= 10 :
    cost_ground = weight * 4.0 + 20
elif weight >10 :
    cost_ground = weight * 4.75 + 20

print("Ground Shipping $ ", cost_ground)


# Ground Shipping Premium
cost_ground_premium = 125.00

print("Ground Shipping Premium $ ", cost_ground_premium)


# Drone Shipping
if weight <= 2 :
    drone_shipping = weight * 4.5
elif 2 < weight <= 6 :
    drone_shipping = weight * 9.0
elif 6 < weight <= 10 :
    drone_shipping = weight * 12.0
elif weight >10 :
    drone_shipping = weight * 14.25

print("Drone Shipping: $ ", drone_shipping)

