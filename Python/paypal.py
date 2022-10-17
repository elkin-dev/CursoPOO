import email
from payment import Payment
email = str
class Paypal(Payment):
    def __init__(self, id, email):
        super.__init__(id)
        self.email = email
