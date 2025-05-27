// Event Data (Mock API Simulation)
const events = [
    { id: 1, name: 'Music Fest', date: '2025-07-10', seats: 100, category: 'Music' },
    { id: 2, name: 'Art Exhibition', date: '2025-08-01', seats: 50, category: 'Art' },
    { id: 3, name: 'Cooking Workshop', date: '2025-06-20', seats: 20, category: 'Workshop' },
    { id: 4, name: 'Tech Talk', date: '2025-06-15', seats: 0, category: 'Tech' }
];

// Initialize UI Elements
const eventsList = document.getElementById('eventsList');
const categorySelect = document.getElementById('categorySelect');

// Function to Display Events
function displayEvents(eventsToDisplay) {
    eventsList.innerHTML = ''; // Clear previous events
    if (eventsToDisplay.length === 0) {
        eventsList.innerHTML = '<p>No events available.</p>';
        return;
    }

    eventsToDisplay.forEach(event => {
        const eventCard = document.createElement('div');
        eventCard.classList.add('event-card');
        eventCard.innerHTML = `
            <h3>${event.name}</h3>
            <p>Date: ${new Date(event.date).toLocaleDateString()}</p>
            <p>Seats Available: ${event.seats}</p>
            <button onclick="registerUser(${event.id})" ${event.seats === 0 ? 'disabled' : ''}>Register</button>
        `;
        eventsList.appendChild(eventCard);
    });
}

// Filter Events by Category
categorySelect.addEventListener('change', function () {
    const category = categorySelect.value;
    const filteredEvents = category === 'All' 
        ? events 
        : events.filter(event => event.category === category);
    displayEvents(filteredEvents);
});

// Register User for Event
function registerUser(eventId) {
    const event = events.find(event => event.id === eventId);
    if (event && event.seats > 0) {
        event.seats--;
        alert(`You have registered for the ${event.name}. Seats remaining: ${event.seats}`);
        displayEvents(events); // Update the event list
    } else {
        alert('This event is fully booked.');
    }
}

// Load Events Initially
document.getElementById('loadEventsBtn').addEventListener('click', function () {
    displayEvents(events); // Show all events
});

// Initial Load (if required)
displayEvents(events);
