When the program is run,

1) A Manager Window appears, where the manager who is taking the next order enters his/her name.
2) On clicking the TAKE ORDER button, the Customer window appears, pushing the manager window
   to background.
3) The customer window is made up of 7 panels:
	-pll : Label holding the heading
	-Hi  : Panel comprises the customer details form and type of order-take away
	-offer : Panel comprises of offer on avail of coupon code, and buffet option
	-tp    : Tabbed pane consisting os segregated starters,maincourse and deserts
			-Items are checkboxes, and number can be incremented with a spinner
	-info  : shows the orders items info, no of each items, total without takes
	-bill  : shows the bill, tax, discount, total payable. has card or cash radio buttons
	-feedback : -Shows the feedback input items for chef and service,
		    -manager can end the customer detail, or create new customer or view log 			     register.
4)Dynamic programming is immitated and many common bugs have been cleared.
5)Many Java compomemts have been implemented and interlinked for making the maximum.

6)On clicking TAKE ORDER, the customer window displays the manager info.
7)On clicking the Take away option, buffet option is dynamically removed.
	-even if buffet if first clicked, and then takeaway is selected, buffet order will be 	cancelled dynamically
8)Entered coupon code will be used in deducting the total amount by some percentage
9)selecting buffet option makes a dumb ear to menu items, their selection will no affect the 	order.
10)on selecting the item, spinner automatically sets its value to 1.( because we cant order zero items. deselecting is viceversa
11)VIEW ORDER shows the order but doesnt confirm it yet, changes can be made.
12)PLACE ORDER places the order which is irreversable.
13)Card or cash payment can be selected only then will the MAKE PAYMENT option is viewed
14)Make payment displays a feedback request.
15)The customer can leave on THANK YOU.Customer information is stored.
16)If a new customer arrives in between, manager can proceed to that customer by clicking 
   NEW CUSTOMER.
17) VIEW LOG shows the previous log register.

-----V SRI CHARAN SIMHA-----
-----THANKYOU-----