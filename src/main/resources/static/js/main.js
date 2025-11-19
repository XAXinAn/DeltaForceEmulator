window.onload = function() {
    if (window.history.replaceState) {
        const url = new URL(window.location.href);
        if (url.searchParams.has('error')) {
            url.searchParams.delete('error');
            window.history.replaceState({path: url.href}, '', url.href);
        }
    }
};
