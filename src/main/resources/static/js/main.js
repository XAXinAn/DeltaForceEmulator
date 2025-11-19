// This script removes the '?error' query parameter from the URL after the page loads.
// This prevents the error message from reappearing on page refresh.
window.onload = function() {
    if (window.history.replaceState) {
        const url = new URL(window.location.href);
        if (url.searchParams.has('error')) {
            url.searchParams.delete('error');
            window.history.replaceState({path: url.href}, '', url.href);
        }
    }
};
