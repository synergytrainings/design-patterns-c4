function Product() {
	var self = this;
	var price = 0;
	var quantity = 0;
	var totalPrice = 0;

	this.setQuantity = function (_quantity) {
		quantity = _quantity;
	};

	this.getQuantity = function () {
		return quantity;
	};

	this.setPrice = function (_price) {
		price = _price;
	};

	this.getPrice = function () {
		return price;
	};

	this.calculate = function () {
		totalPrice = price * quantity;
	};

	this.setTotalPrice = function (_totalPrice) {
		totalPrice = _totalPrice;
	};

	this.getTotalPrice = function () {
		return totalPrice;
	};

	this.accept = function (visitor) {
		visitor.visit(self);
	};
}

function Cart() {
	this.visit = function (product) {
		product.setQuantity(product.getQuantity() + 2);
	}
}

function Checkout() {
	this.visit = function (product) {
		product.setPrice(product.getPrice() + 200);
		product.calculate();
	}
}

function CheckoutProcess() {
	this.visit = function (product) {
		product.setTotalPrice(product.getQuantity() * product.getPrice());
	}
}

var product = new Product();
var cart = new Cart();
var checkout = new Checkout();
var checkoutProcess = new CheckoutProcess();

product.accept(cart);
product.accept(checkout);
product.accept(checkoutProcess);

console.log('quantity = ' + product.getQuantity() + ', price = ' + product.getPrice() + ', total price = ' + product.getTotalPrice());